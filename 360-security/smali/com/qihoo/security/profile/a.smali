.class Lcom/qihoo/security/profile/a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/profile/g;


# instance fields
.field a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/qihoo/security/profile/a;->a:Landroid/content/Context;

    .line 11
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 15
    const/4 v0, 0x4

    return v0
.end method

.method public a(J)Ljava/lang/String;
    .locals 1

    .prologue
    .line 20
    const-string/jumbo v0, "/sys/class/power_supply/battery/capacity"

    invoke-static {v0}, Lcom/qihoo/security/profile/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
