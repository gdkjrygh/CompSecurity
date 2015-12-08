.class public final Lcom/c/a/a/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/a/w$a;,
        Lcom/c/a/a/w$b;
    }
.end annotation


# static fields
.field private static final a:Lcom/c/a/a/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 346
    const/16 v0, 0x2c

    invoke-static {v0}, Lcom/c/a/a/r;->a(C)Lcom/c/a/a/r;

    move-result-object v0

    sput-object v0, Lcom/c/a/a/w;->a:Lcom/c/a/a/r;

    return-void
.end method

.method public static a(Ljava/lang/Object;)Lcom/c/a/a/v;
    .locals 2
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 179
    if-nez p0, :cond_0

    sget-object v0, Lcom/c/a/a/w$b;->c:Lcom/c/a/a/w$b;

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/a/a/w$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/c/a/a/w$a;-><init>(Ljava/lang/Object;B)V

    goto :goto_0
.end method
