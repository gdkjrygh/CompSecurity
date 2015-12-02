.class public Lcom/facebook/common/e/b;
.super Ljava/lang/Object;
.source "ErrorReporting.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field static final a:Ljava/util/Random;

.field private static b:Lcom/facebook/common/e/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lcom/facebook/common/e/b;->a:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 50
    sget-object v0, Lcom/facebook/common/e/b;->b:Lcom/facebook/common/e/h;

    if-eqz v0, :cond_0

    .line 51
    sget-object v0, Lcom/facebook/common/e/b;->b:Lcom/facebook/common/e/h;

    invoke-interface {v0, p0, p1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    :goto_0
    return-void

    .line 53
    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x3e8

    invoke-static {p0, p1, v0, v1, v2}, Lcom/facebook/common/e/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    goto :goto_0
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 76
    sget-object v0, Lcom/facebook/common/e/b;->b:Lcom/facebook/common/e/h;

    if-eqz v0, :cond_0

    .line 77
    sget-object v0, Lcom/facebook/common/e/b;->b:Lcom/facebook/common/e/h;

    invoke-interface {v0, p0, p1, p2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    :goto_0
    return-void

    .line 79
    :cond_0
    const/4 v0, 0x0

    const/16 v1, 0x3e8

    invoke-static {p0, p1, p2, v0, v1}, Lcom/facebook/common/e/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    goto :goto_0
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZI)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 112
    sget-object v0, Lcom/facebook/common/e/b;->b:Lcom/facebook/common/e/h;

    if-eqz v0, :cond_1

    .line 113
    sget-object v0, Lcom/facebook/common/e/b;->b:Lcom/facebook/common/e/h;

    invoke-static {p0, p1}, Lcom/facebook/common/e/m;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/e/n;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/facebook/common/e/n;->a(Ljava/lang/Throwable;)Lcom/facebook/common/e/n;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/facebook/common/e/n;->a(Z)Lcom/facebook/common/e/n;

    move-result-object v1

    invoke-virtual {v1, p4}, Lcom/facebook/common/e/n;->a(I)Lcom/facebook/common/e/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/common/e/n;->g()Lcom/facebook/common/e/m;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/common/e/h;->a(Lcom/facebook/common/e/m;)V

    .line 162
    :cond_0
    :goto_0
    return-void

    .line 122
    :cond_1
    invoke-static {}, Lcom/facebook/base/b;->a()Z

    move-result v0

    .line 123
    if-eqz p3, :cond_2

    if-eqz v0, :cond_2

    .line 124
    invoke-static {}, Lorg/acra/ErrorReporter;->getInstance()Lorg/acra/ErrorReporter;

    move-result-object v0

    .line 125
    const-string v1, "soft_error_message"

    const-string v2, "\n"

    const-string v3, "\\n"

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/acra/ErrorReporter;->putCustomData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Soft error FAILING HARDER: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 130
    :cond_2
    if-nez v0, :cond_3

    .line 131
    sget-object v0, Lcom/facebook/common/e/b;->a:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    rem-int/2addr v0, p4

    if-nez v0, :cond_0

    .line 135
    const/4 v0, 0x1

    if-eq p4, v0, :cond_3

    .line 136
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " [freq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 141
    :cond_3
    if-eqz p2, :cond_4

    .line 142
    :goto_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/facebook/common/e/c;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/common/e/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 141
    :cond_4
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Soft error"

    invoke-direct {v0, v1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p2, v0

    goto :goto_1
.end method
