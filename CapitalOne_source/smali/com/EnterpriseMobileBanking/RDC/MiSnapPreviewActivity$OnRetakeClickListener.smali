.class Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnRetakeClickListener;
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
    name = "OnRetakeClickListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;


# direct methods
.method private constructor <init>(Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnRetakeClickListener;->this$0:Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;
    .param p2, "x1"    # Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$1;

    .prologue
    .line 153
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnRetakeClickListener;-><init>(Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 158
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity$OnRetakeClickListener;->this$0:Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;

    # invokes: Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->finishRetakeOrBackPressed()V
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;->access$200(Lcom/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity;)V

    .line 159
    return-void
.end method
