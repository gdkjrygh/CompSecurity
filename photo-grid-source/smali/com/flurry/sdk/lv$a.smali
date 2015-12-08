.class final Lcom/flurry/sdk/lv$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field final synthetic a:Lcom/flurry/sdk/lv;


# direct methods
.method private constructor <init>(Lcom/flurry/sdk/lv;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/flurry/sdk/lv$a;->a:Lcom/flurry/sdk/lv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/flurry/sdk/lv;Lcom/flurry/sdk/lv$1;)V
    .locals 0

    .prologue
    .line 103
    invoke-direct {p0, p1}, Lcom/flurry/sdk/lv$a;-><init>(Lcom/flurry/sdk/lv;)V

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/flurry/sdk/lv$a;->a:Lcom/flurry/sdk/lv;

    invoke-static {v0, p1, p2}, Lcom/flurry/sdk/lv;->a(Lcom/flurry/sdk/lv;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 107
    iget-object v0, p0, Lcom/flurry/sdk/lv$a;->a:Lcom/flurry/sdk/lv;

    invoke-static {v0, p1, p2}, Lcom/flurry/sdk/lv;->b(Lcom/flurry/sdk/lv;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 108
    return-void
.end method
