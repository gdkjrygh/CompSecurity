.class public Lcom/cleanmaster/service/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/cleanmaster/service/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x0

    sput-object v0, Lcom/cleanmaster/service/a;->a:Lcom/cleanmaster/service/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)J
    .locals 4

    .prologue
    .line 26
    const-wide/32 v0, 0x5265c00

    int-to-long v2, p0

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public static a()Lcom/cleanmaster/service/a;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/cleanmaster/service/a;->a:Lcom/cleanmaster/service/a;

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Lcom/cleanmaster/service/a;

    invoke-direct {v0}, Lcom/cleanmaster/service/a;-><init>()V

    sput-object v0, Lcom/cleanmaster/service/a;->a:Lcom/cleanmaster/service/a;

    .line 23
    :cond_0
    sget-object v0, Lcom/cleanmaster/service/a;->a:Lcom/cleanmaster/service/a;

    return-object v0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 92
    if-nez p0, :cond_0

    .line 97
    :goto_0
    return-void

    .line 95
    :cond_0
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "misc"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 96
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "user-agent"

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0
.end method

.method public static b()Ljava/lang/String;
    .locals 3

    .prologue
    .line 87
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "misc"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 88
    const-string v1, "user-agent"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
