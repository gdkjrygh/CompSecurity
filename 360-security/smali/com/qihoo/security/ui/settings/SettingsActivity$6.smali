.class Lcom/qihoo/security/ui/settings/SettingsActivity$6;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/settings/SettingsActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/settings/SettingsActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$6;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$6;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->a(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    .line 132
    return-void
.end method
