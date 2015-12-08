.class public Lcom/googlecode/flickrjandroid/reflection/Method;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final READ_PERMISSION:I = 0x1

.field public static final WRITE_PERMISSION:I = 0x2


# instance fields
.field private arguments:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/reflection/Argument;",
            ">;"
        }
    .end annotation
.end field

.field private description:Ljava/lang/String;

.field private errors:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/reflection/Error;",
            ">;"
        }
    .end annotation
.end field

.field private explanation:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private needsLogin:Z

.field private needsSigning:Z

.field private requiredPerms:I

.field private response:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getArguments()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/reflection/Argument;",
            ">;"
        }
    .end annotation

    .prologue
    .line 88
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->arguments:Ljava/util/Collection;

    if-nez v0, :cond_0

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->arguments:Ljava/util/Collection;

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->arguments:Ljava/util/Collection;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getErrors()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/reflection/Error;",
            ">;"
        }
    .end annotation

    .prologue
    .line 99
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->errors:Ljava/util/Collection;

    if-nez v0, :cond_0

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->errors:Ljava/util/Collection;

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->errors:Ljava/util/Collection;

    return-object v0
.end method

.method public getExplanation()Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->explanation:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getRequiredPerms()I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->requiredPerms:I

    return v0
.end method

.method public getResponse()Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->response:Ljava/lang/String;

    return-object v0
.end method

.method public needsLogin()Z
    .locals 1

    .prologue
    .line 40
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->needsLogin:Z

    return v0
.end method

.method public needsSigning()Z
    .locals 1

    .prologue
    .line 48
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->needsSigning:Z

    return v0
.end method

.method public setArguments(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/reflection/Argument;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 95
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->arguments:Ljava/util/Collection;

    .line 96
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->description:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public setErrors(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/reflection/Error;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 106
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->errors:Ljava/util/Collection;

    .line 107
    return-void
.end method

.method public setExplanation(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->explanation:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->name:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public setNeedsLogin(Z)V
    .locals 0

    .prologue
    .line 44
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->needsLogin:Z

    .line 45
    return-void
.end method

.method public setNeedsSigning(Z)V
    .locals 0

    .prologue
    .line 52
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->needsSigning:Z

    .line 53
    return-void
.end method

.method public setRequiredPerms(I)V
    .locals 0

    .prologue
    .line 60
    iput p1, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->requiredPerms:I

    .line 61
    return-void
.end method

.method public setResponse(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/reflection/Method;->response:Ljava/lang/String;

    .line 77
    return-void
.end method
