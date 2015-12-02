.class Lcom/qihoo/security/ui/result/view/ResultScrollView$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/view/ResultScrollView;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/result/view/ResultScrollView;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/result/view/ResultScrollView;)V
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$1;->a:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 80
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$1;->a:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    invoke-virtual {v0, v1, v1}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->smoothScrollTo(II)V

    .line 81
    return-void
.end method
