.class public Lcom/facebook/e/b;
.super Ljava/lang/Object;
.source "DataUsageProperties.java"


# static fields
.field static final a:Lcom/facebook/prefs/shared/ae;

.field public static final b:Lcom/facebook/prefs/shared/ae;

.field static final c:Lcom/facebook/prefs/shared/ae;

.field static final d:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final e:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/prefs/shared/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 22
    sget-object v0, Lcom/facebook/prefs/shared/aj;->d:Lcom/facebook/prefs/shared/ae;

    const-string v1, "data_usage/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/e/b;->a:Lcom/facebook/prefs/shared/ae;

    .line 25
    sget-object v0, Lcom/facebook/e/b;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "limited"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/e/b;->b:Lcom/facebook/prefs/shared/ae;

    .line 27
    sget-object v0, Lcom/facebook/e/b;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "hourly_limit_kb"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/e/b;->c:Lcom/facebook/prefs/shared/ae;

    .line 28
    sget-object v0, Lcom/facebook/e/b;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "alarm_limit_kb"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/e/b;->d:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const-class v0, Lcom/facebook/e/b;

    iput-object v0, p0, Lcom/facebook/e/b;->e:Ljava/lang/Class;

    .line 33
    iput-object p1, p0, Lcom/facebook/e/b;->f:Lcom/facebook/prefs/shared/d;

    .line 34
    return-void
.end method
