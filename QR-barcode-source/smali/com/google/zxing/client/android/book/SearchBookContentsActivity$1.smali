.class Lcom/google/zxing/client/android/book/SearchBookContentsActivity$1;
.super Ljava/lang/Object;
.source "SearchBookContentsActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/zxing/client/android/book/SearchBookContentsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/zxing/client/android/book/SearchBookContentsActivity;


# direct methods
.method constructor <init>(Lcom/google/zxing/client/android/book/SearchBookContentsActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/google/zxing/client/android/book/SearchBookContentsActivity$1;->this$0:Lcom/google/zxing/client/android/book/SearchBookContentsActivity;

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 80
    iget-object v0, p0, Lcom/google/zxing/client/android/book/SearchBookContentsActivity$1;->this$0:Lcom/google/zxing/client/android/book/SearchBookContentsActivity;

    # invokes: Lcom/google/zxing/client/android/book/SearchBookContentsActivity;->launchSearch()V
    invoke-static {v0}, Lcom/google/zxing/client/android/book/SearchBookContentsActivity;->access$0(Lcom/google/zxing/client/android/book/SearchBookContentsActivity;)V

    .line 81
    return-void
.end method
