.class final Lcom/kik/sdkutils/KikServiceBase$a;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/sdkutils/KikServiceBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/sdkutils/KikServiceBase;


# direct methods
.method public constructor <init>(Lcom/kik/sdkutils/KikServiceBase;)V
    .locals 2

    .prologue
    .line 52
    iput-object p1, p0, Lcom/kik/sdkutils/KikServiceBase$a;->a:Lcom/kik/sdkutils/KikServiceBase;

    .line 53
    new-instance v0, Lcom/kik/sdkutils/z;

    invoke-direct {v0, p1}, Lcom/kik/sdkutils/z;-><init>(Lcom/kik/sdkutils/KikServiceBase;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 61
    return-void
.end method
