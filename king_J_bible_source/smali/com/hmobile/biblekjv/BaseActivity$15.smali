.class Lcom/hmobile/biblekjv/BaseActivity$15;
.super Ljava/lang/Object;
.source "BaseActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BaseActivity;->menuDialogDisplay()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/BaseActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BaseActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$15;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    .line 976
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 989
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$15;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/BaseActivity;->removeAds()V

    .line 990
    return-void
.end method
