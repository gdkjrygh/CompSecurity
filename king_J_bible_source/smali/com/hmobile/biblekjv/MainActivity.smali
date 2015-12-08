.class public Lcom/hmobile/biblekjv/MainActivity;
.super Landroid/app/TabActivity;
.source "MainActivity.java"


# instance fields
.field result:Ljava/lang/String;

.field tabHost:Landroid/widget/TabHost;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Landroid/app/TabActivity;-><init>()V

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/MainActivity;->result:Ljava/lang/String;

    .line 8
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 16
    invoke-super {p0, p1}, Landroid/app/TabActivity;->onCreate(Landroid/os/Bundle;)V

    .line 17
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/MainActivity;->requestWindowFeature(I)Z

    .line 18
    const v0, 0x7f030031

    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/MainActivity;->setContentView(I)V

    .line 19
    return-void
.end method
