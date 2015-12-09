.class final Lcom/EnterpriseMobileBanking/AppHelper$14;
.super Ljava/lang/Object;
.source "AppHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AppHelper;->changeSignOut(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$visibility:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    .prologue
    .line 708
    iput p1, p0, Lcom/EnterpriseMobileBanking/AppHelper$14;->val$visibility:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 712
    # getter for: Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->access$000()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v0

    const v1, 0x7f0800af

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lcom/EnterpriseMobileBanking/AppHelper$14;->val$visibility:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 713
    return-void
.end method
