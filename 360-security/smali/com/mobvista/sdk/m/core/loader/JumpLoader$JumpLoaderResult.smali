.class public Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/core/util/NoProGuard;
.implements Ljava/io/Serializable;


# static fields
.field public static final CODE_DOWNLOAD:I = 0x3

.field public static final CODE_LINK:I = 0x2

.field public static final CODE_MARKET:I = 0x1

.field public static final CODE_NULL:I = 0x4

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private code:I

.field private content:Ljava/lang/String;

.field private jumpDone:Z

.field private msg:Ljava/lang/String;

.field private noticeurl:Ljava/lang/String;

.field private success:Z

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCode()I
    .locals 1

    .prologue
    .line 254
    iget v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->code:I

    return v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getMsg()Ljava/lang/String;
    .locals 1

    .prologue
    .line 246
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->msg:Ljava/lang/String;

    return-object v0
.end method

.method public getNoticeurl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 230
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->noticeurl:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 262
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->url:Ljava/lang/String;

    return-object v0
.end method

.method public isSuccess()Z
    .locals 1

    .prologue
    .line 238
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->success:Z

    return v0
.end method

.method public isjumpDone()Z
    .locals 1

    .prologue
    .line 278
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->jumpDone:Z

    return v0
.end method

.method public setCode(I)V
    .locals 0

    .prologue
    .line 258
    iput p1, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->code:I

    .line 259
    return-void
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 274
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->content:Ljava/lang/String;

    .line 275
    return-void
.end method

.method public setMsg(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 250
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->msg:Ljava/lang/String;

    .line 251
    return-void
.end method

.method public setNoticeurl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 234
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->noticeurl:Ljava/lang/String;

    .line 235
    return-void
.end method

.method public setSuccess(Z)V
    .locals 0

    .prologue
    .line 242
    iput-boolean p1, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->success:Z

    .line 243
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 266
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->url:Ljava/lang/String;

    .line 267
    return-void
.end method

.method public setjumpDone(Z)V
    .locals 0

    .prologue
    .line 282
    iput-boolean p1, p0, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->jumpDone:Z

    .line 283
    return-void
.end method
