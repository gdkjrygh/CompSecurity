.class public Lcom/qihoo/security/profile/h;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/profile/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 8
    const/4 v0, 0x5

    return v0
.end method

.method public a(J)Ljava/lang/String;
    .locals 1

    .prologue
    .line 13
    const-string/jumbo v0, "/proc/loadavg"

    invoke-static {v0}, Lcom/qihoo/security/profile/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
