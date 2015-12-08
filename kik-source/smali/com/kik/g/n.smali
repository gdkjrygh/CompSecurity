.class public final Lcom/kik/g/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/g/n$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;

.field private b:Lcom/kik/g/n$a;

.field private c:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(Lcom/kik/g/n$a;)V
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/g/n;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 59
    iput-object p1, p0, Lcom/kik/g/n;->b:Lcom/kik/g/n$a;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/g/n;->a:Ljava/util/List;

    .line 61
    return-void
.end method
