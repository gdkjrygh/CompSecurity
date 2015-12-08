.class Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask$1;
.super Ljava/lang/Object;
.source "CloseCallbackTask.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask$1;->this$0:Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 64
    const/4 v0, 0x0

    return v0
.end method
