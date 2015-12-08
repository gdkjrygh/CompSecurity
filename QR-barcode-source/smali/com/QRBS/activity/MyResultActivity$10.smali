.class Lcom/QRBS/activity/MyResultActivity$10;
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
    iput-object p1, p0, Lcom/QRBS/activity/MyResultActivity$10;->this$0:Lcom/QRBS/activity/MyResultActivity;

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 251
    iget-object v0, p0, Lcom/QRBS/activity/MyResultActivity$10;->this$0:Lcom/QRBS/activity/MyResultActivity;

    invoke-virtual {v0}, Lcom/QRBS/activity/MyResultActivity;->finish()V

    .line 252
    return-void
.end method
