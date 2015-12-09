.class Lcom/EnterpriseMobileBanking/AppRelContainer$1;
.super Ljava/lang/Object;
.source "AppRelContainer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AppRelContainer;->onAnimationEnd()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/AppRelContainer;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/AppRelContainer;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AppRelContainer$1;->this$0:Lcom/EnterpriseMobileBanking/AppRelContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 88
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideKeyboard()V

    .line 89
    return-void
.end method
