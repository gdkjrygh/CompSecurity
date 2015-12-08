.class Lcom/QRBS/activity/CreateCalendar$6;
.super Ljava/lang/Object;
.source "CreateCalendar.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/CreateCalendar;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/CreateCalendar;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/CreateCalendar;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/CreateCalendar$6;->this$0:Lcom/QRBS/activity/CreateCalendar;

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 77
    iget-object v0, p0, Lcom/QRBS/activity/CreateCalendar$6;->this$0:Lcom/QRBS/activity/CreateCalendar;

    # invokes: Lcom/QRBS/activity/CreateCalendar;->showDataDialog()V
    invoke-static {v0}, Lcom/QRBS/activity/CreateCalendar;->access$0(Lcom/QRBS/activity/CreateCalendar;)V

    .line 78
    return-void
.end method
