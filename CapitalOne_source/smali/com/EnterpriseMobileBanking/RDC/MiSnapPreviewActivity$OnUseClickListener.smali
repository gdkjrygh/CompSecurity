.class Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnUseClickListener;
.super Ljava/lang/Object;
.source "MiSnapPreviewActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "OnUseClickListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;


# direct methods
.method private constructor <init>(Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;)V
    .locals 0

    .prologue
    .line 138
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnUseClickListener;->this$0:Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;
    .param p2, "x1"    # Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$1;

    .prologue
    .line 138
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnUseClickListener;-><init>(Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 143
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnUseClickListener;->this$0:Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;

    const v1, 0x631198

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnUseClickListener;->this$0:Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;

    invoke-virtual {v2}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->setResult(ILandroid/content/Intent;)V

    .line 144
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnUseClickListener;->this$0:Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->finish()V

    .line 145
    return-void
.end method
