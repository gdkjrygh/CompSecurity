.class Lcom/google/zxing/client/android/share/ShareActivity$5;
.super Ljava/lang/Object;
.source "ShareActivity.java"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/zxing/client/android/share/ShareActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/zxing/client/android/share/ShareActivity;


# direct methods
.method constructor <init>(Lcom/google/zxing/client/android/share/ShareActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/google/zxing/client/android/share/ShareActivity$5;->this$0:Lcom/google/zxing/client/android/share/ShareActivity;

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "keyCode"    # I
    .param p3, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 99
    const/16 v1, 0x42

    if-ne p2, v1, :cond_1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_1

    .line 100
    check-cast p1, Landroid/widget/TextView;

    .end local p1    # "view":Landroid/view/View;
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 101
    .local v0, "text":Ljava/lang/String;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 102
    iget-object v1, p0, Lcom/google/zxing/client/android/share/ShareActivity$5;->this$0:Lcom/google/zxing/client/android/share/ShareActivity;

    # invokes: Lcom/google/zxing/client/android/share/ShareActivity;->launchSearch(Ljava/lang/String;)V
    invoke-static {v1, v0}, Lcom/google/zxing/client/android/share/ShareActivity;->access$0(Lcom/google/zxing/client/android/share/ShareActivity;Ljava/lang/String;)V

    .line 104
    :cond_0
    const/4 v1, 0x1

    .line 106
    .end local v0    # "text":Ljava/lang/String;
    :goto_0
    return v1

    .restart local p1    # "view":Landroid/view/View;
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method
