.class synthetic Lcom/qihoo/security/ui/settings/SettingsActivity$5;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/settings/SettingsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 505
    invoke-static {}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->values()[Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/qihoo/security/ui/settings/SettingsActivity$5;->a:[I

    return-void
.end method
