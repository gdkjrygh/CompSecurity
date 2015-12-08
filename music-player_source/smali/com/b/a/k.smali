.class public final Lcom/b/a/k;
.super Ljava/lang/Object;


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "http://alog.umeng.com/app_logs"

    aput-object v1, v0, v2

    const-string v1, "http://alog.umeng.co/app_logs"

    aput-object v1, v0, v3

    sput-object v0, Lcom/b/a/k;->a:[Ljava/lang/String;

    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "http://oc.umeng.com/check_config_update"

    aput-object v1, v0, v2

    const-string v1, "http://oc.umeng.co/check_config_update"

    aput-object v1, v0, v3

    sput-object v0, Lcom/b/a/k;->b:[Ljava/lang/String;

    return-void
.end method
