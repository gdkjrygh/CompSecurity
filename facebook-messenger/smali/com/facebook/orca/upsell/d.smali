.class public final Lcom/facebook/orca/upsell/d;
.super Ljava/lang/Object;
.source "MessengerUpsellPrefKeys.java"


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;

.field public static final b:Lcom/facebook/prefs/shared/ae;

.field public static final c:Lcom/facebook/prefs/shared/ae;

.field public static final d:Lcom/facebook/prefs/shared/ae;

.field public static final e:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 14
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "messenger_upsell/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/upsell/d;->a:Lcom/facebook/prefs/shared/ae;

    .line 16
    sget-object v0, Lcom/facebook/orca/upsell/d;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "chat_head_install_promo_times_shown"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/upsell/d;->b:Lcom/facebook/prefs/shared/ae;

    .line 18
    sget-object v0, Lcom/facebook/orca/upsell/d;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "chat_head_install_promo_daily_times_shown"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/upsell/d;->c:Lcom/facebook/prefs/shared/ae;

    .line 20
    sget-object v0, Lcom/facebook/orca/upsell/d;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "chat_head_install_promo_daily_first_shown_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/upsell/d;->d:Lcom/facebook/prefs/shared/ae;

    .line 22
    sget-object v0, Lcom/facebook/orca/upsell/d;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "chat_head_install_promo_last_conversion_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/upsell/d;->e:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
