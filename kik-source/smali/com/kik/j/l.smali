.class public final Lcom/kik/j/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a/a;


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:Lcom/kik/j/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 7
    const-class v0, Lcom/kik/j/l;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/kik/j/l;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Lcom/kik/j/k;)V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    sget-boolean v0, Lcom/kik/j/l;->a:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 13
    :cond_0
    iput-object p1, p0, Lcom/kik/j/l;->b:Lcom/kik/j/k;

    .line 14
    return-void
.end method

.method public static a(Lcom/kik/j/k;)La/a/a;
    .locals 1

    .prologue
    .line 26
    new-instance v0, Lcom/kik/j/l;

    invoke-direct {v0, p0}, Lcom/kik/j/l;-><init>(Lcom/kik/j/k;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 7
    iget-object v0, p0, Lcom/kik/j/l;->b:Lcom/kik/j/k;

    invoke-virtual {v0}, Lcom/kik/j/k;->a()Lkik/android/util/bj;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-object v0
.end method
