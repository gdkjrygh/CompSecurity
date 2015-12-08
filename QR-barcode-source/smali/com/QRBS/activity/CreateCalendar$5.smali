.class Lcom/QRBS/activity/CreateCalendar$5;
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
    iput-object p1, p0, Lcom/QRBS/activity/CreateCalendar$5;->this$0:Lcom/QRBS/activity/CreateCalendar;

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 69
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/QRBS/activity/CreateCalendar$5;->this$0:Lcom/QRBS/activity/CreateCalendar;

    const-class v2, Lcom/QRBS/activity/CalendarListSel;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 70
    .local v0, "i":Landroid/content/Intent;
    iget-object v1, p0, Lcom/QRBS/activity/CreateCalendar$5;->this$0:Lcom/QRBS/activity/CreateCalendar;

    invoke-virtual {v1, v0}, Lcom/QRBS/activity/CreateCalendar;->startActivity(Landroid/content/Intent;)V

    .line 71
    return-void
.end method
