.class Lcom/thetransitapp/droid/OptionScreen$2;
.super Landroid/database/DataSetObserver;
.source "OptionScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/OptionScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/OptionScreen;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/OptionScreen;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/OptionScreen$2;->this$0:Lcom/thetransitapp/droid/OptionScreen;

    .line 64
    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    .prologue
    .line 67
    invoke-super {p0}, Landroid/database/DataSetObserver;->onChanged()V

    .line 69
    iget-object v0, p0, Lcom/thetransitapp/droid/OptionScreen$2;->this$0:Lcom/thetransitapp/droid/OptionScreen;

    # invokes: Lcom/thetransitapp/droid/OptionScreen;->onSelectionChanged()V
    invoke-static {v0}, Lcom/thetransitapp/droid/OptionScreen;->access$0(Lcom/thetransitapp/droid/OptionScreen;)V

    .line 70
    return-void
.end method
