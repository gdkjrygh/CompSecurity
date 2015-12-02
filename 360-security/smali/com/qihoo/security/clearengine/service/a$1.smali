.class Lcom/qihoo/security/clearengine/service/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/opti/i/trashclear/ICallbackTrashScan;


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


# direct methods
.method constructor <init>(Lcom/qihoo/security/clearengine/service/a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/service/a$1;->a:Lcom/qihoo/security/clearengine/service/a;

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinished(I)V
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$1;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->a(Lcom/qihoo/security/clearengine/service/a;)Lcom/qihoo/security/clearengine/service/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/service/c;->a(I)V

    .line 139
    return-void
.end method

.method public onFoundItem(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$1;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->a(Lcom/qihoo/security/clearengine/service/a;)Lcom/qihoo/security/clearengine/service/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/service/c;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    .line 131
    return-void
.end method

.method public onProgress(IILjava/lang/String;)V
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$1;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->a(Lcom/qihoo/security/clearengine/service/a;)Lcom/qihoo/security/clearengine/service/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/qihoo/security/clearengine/service/c;->a(IILjava/lang/String;)V

    .line 123
    return-void
.end method

.method public onStart()V
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$1;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->a(Lcom/qihoo/security/clearengine/service/a;)Lcom/qihoo/security/clearengine/service/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/service/c;->a()V

    .line 115
    return-void
.end method
