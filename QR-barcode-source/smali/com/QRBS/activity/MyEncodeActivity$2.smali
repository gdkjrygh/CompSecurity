.class Lcom/QRBS/activity/MyEncodeActivity$2;
.super Ljava/lang/Object;
.source "MyEncodeActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/MyEncodeActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/MyEncodeActivity;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/MyEncodeActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/MyEncodeActivity$2;->this$0:Lcom/QRBS/activity/MyEncodeActivity;

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/activity/MyEncodeActivity$2;)Lcom/QRBS/activity/MyEncodeActivity;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/QRBS/activity/MyEncodeActivity$2;->this$0:Lcom/QRBS/activity/MyEncodeActivity;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 87
    const/high16 v1, -0x1000000

    .line 88
    .local v1, "initialColor":I
    new-instance v0, Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v2, p0, Lcom/QRBS/activity/MyEncodeActivity$2;->this$0:Lcom/QRBS/activity/MyEncodeActivity;

    const/high16 v3, -0x1000000

    new-instance v4, Lcom/QRBS/activity/MyEncodeActivity$2$1;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/MyEncodeActivity$2$1;-><init>(Lcom/QRBS/activity/MyEncodeActivity$2;)V

    invoke-direct {v0, v2, v3, v4}, Lyuku/ambilwarna/AmbilWarnaDialog;-><init>(Landroid/content/Context;ILyuku/ambilwarna/AmbilWarnaDialog$OnAmbilWarnaListener;)V

    .line 104
    .local v0, "dialog":Lyuku/ambilwarna/AmbilWarnaDialog;
    invoke-virtual {v0}, Lyuku/ambilwarna/AmbilWarnaDialog;->show()V

    .line 106
    return-void
.end method
