.class public final Lcrittercism/android/be;
.super Lcom/crittercism/app/Transaction;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 6
    invoke-direct {p0}, Lcom/crittercism/app/Transaction;-><init>()V

    .line 7
    const-string v0, "Crittercism"

    const-string v1, "Creating no-op transaction"

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 12
    const-string v0, "Crittercism"

    const-string v1, "No-op transaction. Ignoring Transaction.start() call."

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "No-op transaction"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    return-void
.end method

.method public final a(I)V
    .locals 4

    .prologue
    .line 33
    const-string v0, "Crittercism"

    const-string v1, "No-op transaction. Ignoring Transaction.setValue(double) call."

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "No-op transaction"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 19
    const-string v0, "Crittercism"

    const-string v1, "No-op transaction. Ignoring Transaction.stop() call."

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "No-op transaction"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    return-void
.end method

.method public final c()V
    .locals 4

    .prologue
    .line 26
    const-string v0, "Crittercism"

    const-string v1, "No-op transaction. Ignoring Transaction.fail() call."

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "No-op transaction"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    return-void
.end method

.method public final d()I
    .locals 4

    .prologue
    .line 40
    const-string v0, "Crittercism"

    const-string v1, "No-op transaction. Ignoring Transaction.getValue() call."

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "No-op transaction"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    const/4 v0, -0x1

    return v0
.end method
