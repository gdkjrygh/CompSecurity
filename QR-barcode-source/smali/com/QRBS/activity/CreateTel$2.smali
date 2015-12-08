.class Lcom/QRBS/activity/CreateTel$2;
.super Ljava/lang/Object;
.source "CreateTel.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/CreateTel;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/CreateTel;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/CreateTel;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/CreateTel$2;->this$0:Lcom/QRBS/activity/CreateTel;

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 64
    iget-object v0, p0, Lcom/QRBS/activity/CreateTel$2;->this$0:Lcom/QRBS/activity/CreateTel;

    # invokes: Lcom/QRBS/activity/CreateTel;->pickContact()V
    invoke-static {v0}, Lcom/QRBS/activity/CreateTel;->access$0(Lcom/QRBS/activity/CreateTel;)V

    .line 65
    return-void
.end method
