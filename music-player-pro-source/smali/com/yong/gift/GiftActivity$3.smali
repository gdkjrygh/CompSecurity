.class Lcom/yong/gift/GiftActivity$3;
.super Ljava/lang/Object;
.source "GiftActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yong/gift/GiftActivity;->findView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yong/gift/GiftActivity;


# direct methods
.method constructor <init>(Lcom/yong/gift/GiftActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/yong/gift/GiftActivity$3;->this$0:Lcom/yong/gift/GiftActivity;

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 98
    iget-object v0, p0, Lcom/yong/gift/GiftActivity$3;->this$0:Lcom/yong/gift/GiftActivity;

    invoke-virtual {v0}, Lcom/yong/gift/GiftActivity;->finish()V

    .line 99
    return-void
.end method
