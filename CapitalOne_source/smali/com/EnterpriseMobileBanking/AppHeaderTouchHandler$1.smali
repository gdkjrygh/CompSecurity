.class Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler$1;
.super Ljava/lang/Object;
.source "AppHeaderTouchHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;

.field final synthetic val$lastState:Z


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;Z)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler$1;->this$0:Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler;

    iput-boolean p2, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler$1;->val$lastState:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 110
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/AppHeaderTouchHandler$1;->val$lastState:Z

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->setNavigationEnabled(Z)V

    .line 111
    return-void
.end method
