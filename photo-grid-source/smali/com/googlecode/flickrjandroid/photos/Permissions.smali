.class public Lcom/googlecode/flickrjandroid/photos/Permissions;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private addmeta:I

.field private comment:I

.field private familyFlag:Z

.field private friendFlag:Z

.field private id:Ljava/lang/String;

.field private publicFlag:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput v0, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->comment:I

    .line 26
    iput v0, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->addmeta:I

    .line 30
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 90
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    .line 127
    :cond_0
    :goto_0
    return v3

    .line 94
    :cond_1
    check-cast p1, Lcom/googlecode/flickrjandroid/photos/Permissions;

    .line 95
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 96
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    move v2, v3

    .line 97
    :goto_1
    array-length v0, v4

    if-lt v2, v0, :cond_2

    .line 127
    const/4 v3, 0x1

    goto :goto_0

    .line 98
    :cond_2
    sget-object v0, Lcom/googlecode/flickrjandroid/util/StringUtilities;->getterPattern:Ljava/util/regex/Pattern;

    aget-object v1, v4, v2

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 99
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_3

    aget-object v0, v4, v2

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getClass"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 101
    :try_start_0
    aget-object v0, v4, v2

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 102
    aget-object v1, v4, v2

    const/4 v5, 0x0

    invoke-virtual {v1, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 103
    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v5

    .line 104
    const-string v6, "class"

    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    if-nez v6, :cond_4

    .line 105
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    :cond_3
    :goto_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 110
    :cond_4
    const-string v6, "int"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 111
    check-cast v0, Ljava/lang/Integer;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 112
    :cond_5
    const-string v6, "boolean"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 113
    check-cast v0, Ljava/lang/Boolean;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    .line 115
    :cond_6
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "|"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 116
    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 115
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_2

    .line 118
    :catch_0
    move-exception v0

    .line 119
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "equals "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v6, v4, v2

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_2

    .line 122
    :catch_1
    move-exception v0

    .line 123
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "equals "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v6, v4, v2

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 120
    :catch_2
    move-exception v0

    goto/16 :goto_2
.end method

.method public getAddmeta()I
    .locals 1

    .prologue
    .line 77
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->addmeta:I

    return v0
.end method

.method public getComment()I
    .locals 1

    .prologue
    .line 65
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->comment:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->id:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 133
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, 0x57

    .line 134
    new-instance v1, Ljava/lang/Integer;

    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->comment:I

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v1}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 135
    new-instance v1, Ljava/lang/Integer;

    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->addmeta:I

    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v1}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 136
    new-instance v1, Ljava/lang/Boolean;

    iget-boolean v2, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->publicFlag:Z

    invoke-direct {v1, v2}, Ljava/lang/Boolean;-><init>(Z)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 137
    new-instance v1, Ljava/lang/Boolean;

    iget-boolean v2, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->friendFlag:Z

    invoke-direct {v1, v2}, Ljava/lang/Boolean;-><init>(Z)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 138
    new-instance v1, Ljava/lang/Boolean;

    iget-boolean v2, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->familyFlag:Z

    invoke-direct {v1, v2}, Ljava/lang/Boolean;-><init>(Z)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 139
    return v0
.end method

.method public isFamilyFlag()Z
    .locals 1

    .prologue
    .line 57
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->familyFlag:Z

    return v0
.end method

.method public isFriendFlag()Z
    .locals 1

    .prologue
    .line 49
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->friendFlag:Z

    return v0
.end method

.method public isPublicFlag()Z
    .locals 1

    .prologue
    .line 41
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->publicFlag:Z

    return v0
.end method

.method public setAddmeta(I)V
    .locals 0

    .prologue
    .line 81
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->addmeta:I

    .line 82
    return-void
.end method

.method public setAddmeta(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 85
    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Permissions;->setAddmeta(I)V

    .line 86
    :cond_0
    return-void
.end method

.method public setComment(I)V
    .locals 0

    .prologue
    .line 69
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->comment:I

    .line 70
    return-void
.end method

.method public setComment(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 73
    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Permissions;->setComment(I)V

    .line 74
    :cond_0
    return-void
.end method

.method public setFamilyFlag(Z)V
    .locals 0

    .prologue
    .line 61
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->familyFlag:Z

    .line 62
    return-void
.end method

.method public setFriendFlag(Z)V
    .locals 0

    .prologue
    .line 53
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->friendFlag:Z

    .line 54
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->id:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setPublicFlag(Z)V
    .locals 0

    .prologue
    .line 45
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/Permissions;->publicFlag:Z

    .line 46
    return-void
.end method
