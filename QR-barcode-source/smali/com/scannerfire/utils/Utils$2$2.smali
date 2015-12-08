.class Lcom/scannerfire/utils/Utils$2$2;
.super Ljava/lang/Object;
.source "Utils.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scannerfire/utils/Utils$2;->onItemClick(Lcom/QRBS/QuickAction/QuickActionPopup;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/scannerfire/utils/Utils$2;


# direct methods
.method constructor <init>(Lcom/scannerfire/utils/Utils$2;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/scannerfire/utils/Utils$2$2;->this$1:Lcom/scannerfire/utils/Utils$2;

    .line 607
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p1, "arg0"    # Landroid/content/DialogInterface;
    .param p2, "arg1"    # I

    .prologue
    .line 611
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 612
    return-void
.end method
