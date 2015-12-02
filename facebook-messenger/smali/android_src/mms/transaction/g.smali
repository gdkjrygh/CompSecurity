.class final Landroid_src/mms/transaction/g;
.super Ljava/lang/Object;
.source "MessagingNotification.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Landroid_src/mms/transaction/f;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 225
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid_src/mms/transaction/e;)V
    .locals 0

    .prologue
    .line 225
    invoke-direct {p0}, Landroid_src/mms/transaction/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid_src/mms/transaction/f;Landroid_src/mms/transaction/f;)I
    .locals 4

    .prologue
    .line 230
    invoke-virtual {p2}, Landroid_src/mms/transaction/f;->a()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid_src/mms/transaction/f;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->signum(J)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 225
    check-cast p1, Landroid_src/mms/transaction/f;

    check-cast p2, Landroid_src/mms/transaction/f;

    invoke-virtual {p0, p1, p2}, Landroid_src/mms/transaction/g;->a(Landroid_src/mms/transaction/f;Landroid_src/mms/transaction/f;)I

    move-result v0

    return v0
.end method
