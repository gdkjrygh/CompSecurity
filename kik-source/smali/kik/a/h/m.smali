.class public final Lkik/a/h/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/a/h/m$a;
    }
.end annotation


# static fields
.field private static a:Lkik/a/h/m;


# instance fields
.field private b:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 9
    new-instance v0, Lkik/a/h/m;

    invoke-direct {v0}, Lkik/a/h/m;-><init>()V

    sput-object v0, Lkik/a/h/m;->a:Lkik/a/h/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lkik/a/h/m;->b:Ljava/util/Timer;

    .line 15
    return-void
.end method

.method public static a()Lkik/a/h/m;
    .locals 1

    .prologue
    .line 40
    sget-object v0, Lkik/a/h/m;->a:Lkik/a/h/m;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/util/TimerTask;)Lkik/a/h/m$a;
    .locals 4

    .prologue
    .line 45
    new-instance v0, Lkik/a/h/m$a;

    invoke-direct {v0, p0, p1}, Lkik/a/h/m$a;-><init>(Lkik/a/h/m;Ljava/util/TimerTask;)V

    .line 46
    iget-object v1, p0, Lkik/a/h/m;->b:Ljava/util/Timer;

    const-wide/16 v2, 0x3a98

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 48
    return-object v0
.end method
