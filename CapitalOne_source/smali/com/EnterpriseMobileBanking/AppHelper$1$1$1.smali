.class Lcom/EnterpriseMobileBanking/AppHelper$1$1$1;
.super Ljava/lang/Object;
.source "AppHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AppHelper$1$1;->onGlobalLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/EnterpriseMobileBanking/AppHelper$1$1;

.field final synthetic val$heightDiff:I


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/AppHelper$1$1;I)V
    .locals 0

    .prologue
    .line 196
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AppHelper$1$1$1;->this$1:Lcom/EnterpriseMobileBanking/AppHelper$1$1;

    iput p2, p0, Lcom/EnterpriseMobileBanking/AppHelper$1$1$1;->val$heightDiff:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 200
    iget v0, p0, Lcom/EnterpriseMobileBanking/AppHelper$1$1$1;->val$heightDiff:I

    const/16 v1, 0x64

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    # setter for: Lcom/EnterpriseMobileBanking/AppHelper;->keyboard:Z
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->access$102(Z)Z

    .line 203
    return-void

    .line 200
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
