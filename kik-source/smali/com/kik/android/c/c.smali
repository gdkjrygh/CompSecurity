.class public final Lcom/kik/android/c/c;
.super Lcom/kik/android/c/e;
.source "SourceFile"


# instance fields
.field private final a:I


# direct methods
.method private constructor <init>(Ljava/lang/String;I)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 19
    const-wide/16 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, v2

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lcom/kik/android/c/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 20
    iput p2, p0, Lcom/kik/android/c/c;->a:I

    .line 21
    return-void
.end method

.method static a(Ljava/lang/String;I)Lcom/kik/android/c/c;
    .locals 1

    .prologue
    .line 14
    new-instance v0, Lcom/kik/android/c/c;

    invoke-direct {v0, p0, p1}, Lcom/kik/android/c/c;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lcom/kik/android/c/c;->a:I

    return v0
.end method

.method public final b()Lcom/kik/n/a/j/c;
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x0

    return-object v0
.end method
