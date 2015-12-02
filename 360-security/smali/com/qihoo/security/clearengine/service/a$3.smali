.class Lcom/qihoo/security/clearengine/service/a$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashClear;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/clearengine/service/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/clearengine/service/a;

.field private b:I

.field private c:I


# direct methods
.method constructor <init>(Lcom/qihoo/security/clearengine/service/a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/service/a$3;->a:Lcom/qihoo/security/clearengine/service/a;

    .line 240
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinished(I)V
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$3;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->d(Lcom/qihoo/security/clearengine/service/a;)Lcom/qihoo/security/clearengine/service/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/service/b;->a(I)V

    .line 271
    return-void
.end method

.method public onProgress(IILcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 1

    .prologue
    .line 262
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$3;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->d(Lcom/qihoo/security/clearengine/service/a;)Lcom/qihoo/security/clearengine/service/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/qihoo/security/clearengine/service/b;->a(IILcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    .line 263
    return-void
.end method

.method public onStart()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 251
    iput v0, p0, Lcom/qihoo/security/clearengine/service/a$3;->b:I

    .line 252
    iput v0, p0, Lcom/qihoo/security/clearengine/service/a$3;->c:I

    .line 254
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$3;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->d(Lcom/qihoo/security/clearengine/service/a;)Lcom/qihoo/security/clearengine/service/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/service/b;->a()V

    .line 255
    return-void
.end method
