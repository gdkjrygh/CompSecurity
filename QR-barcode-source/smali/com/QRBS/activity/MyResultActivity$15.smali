.class Lcom/QRBS/activity/MyResultActivity$15;
.super Ljava/lang/Object;
.source "MyResultActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/MyResultActivity;->buildButton(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/MyResultActivity;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/MyResultActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/MyResultActivity$15;->this$0:Lcom/QRBS/activity/MyResultActivity;

    .line 429
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 431
    iget-object v0, p0, Lcom/QRBS/activity/MyResultActivity$15;->this$0:Lcom/QRBS/activity/MyResultActivity;

    invoke-virtual {v0}, Lcom/QRBS/activity/MyResultActivity;->finish()V

    .line 432
    return-void
.end method
