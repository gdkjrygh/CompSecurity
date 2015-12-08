.class public Lcom/googlecode/flickrjandroid/photos/PhotoPlace;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final POOL:I = 0x2

.field public static final SET:I = 0x1

.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private id:Ljava/lang/String;

.field private kind:I

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    invoke-virtual {p0, p1}, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->setKind(I)V

    .line 35
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->id:Ljava/lang/String;

    .line 36
    iput-object p3, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->title:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-virtual {p0, p1}, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->setKind(Ljava/lang/String;)V

    .line 49
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->id:Ljava/lang/String;

    .line 50
    iput-object p3, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->title:Ljava/lang/String;

    .line 51
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 112
    if-nez p1, :cond_1

    .line 139
    :cond_0
    :goto_0
    return v0

    .line 115
    :cond_1
    if-ne p1, p0, :cond_2

    move v0, v1

    .line 116
    goto :goto_0

    .line 118
    :cond_2
    instance-of v2, p1, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;

    if-eqz v2, :cond_0

    .line 121
    check-cast p1, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;

    .line 122
    iget v2, p1, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->kind:I

    iget v3, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->kind:I

    if-ne v2, v3, :cond_0

    .line 125
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->id:Ljava/lang/String;

    if-eqz v2, :cond_5

    .line 126
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 132
    :cond_3
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->title:Ljava/lang/String;

    if-eqz v2, :cond_6

    .line 133
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->title:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_4
    move v0, v1

    .line 139
    goto :goto_0

    .line 129
    :cond_5
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->id:Ljava/lang/String;

    if-eqz v2, :cond_3

    goto :goto_0

    .line 136
    :cond_6
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->title:Ljava/lang/String;

    if-eqz v2, :cond_4

    goto :goto_0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getKind()I
    .locals 1

    .prologue
    .line 64
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->kind:I

    return v0
.end method

.method public getKindAsString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 93
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->kind:I

    packed-switch v0, :pswitch_data_0

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unknown("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->kind:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 104
    :goto_0
    return-object v0

    .line 95
    :pswitch_0
    const-string v0, "set"

    goto :goto_0

    .line 98
    :pswitch_1
    const-string v0, "pool"

    goto :goto_0

    .line 93
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->id:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected setKind(I)V
    .locals 0

    .prologue
    .line 68
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->kind:I

    .line 69
    return-void
.end method

.method protected setKind(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 72
    const-string v0, "pool"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->setKind(I)V

    .line 76
    :goto_0
    return-void

    .line 74
    :cond_0
    const-string v0, "set"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 75
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->setKind(I)V

    goto :goto_0

    .line 77
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid kind ["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->getKindAsString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " id=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\" title=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photos/PhotoPlace;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
