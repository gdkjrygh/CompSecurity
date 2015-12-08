.class Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$1;
.super Ljava/lang/Object;
.source "WLDroidGap.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->copyPrepackagedAssetsToLocalCopy()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;


# direct methods
.method constructor <init>(Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$1;->this$1:Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;

    .line 470
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 472
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 475
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 476
    return-void
.end method
