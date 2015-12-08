.class public final Lcom/kik/android/c/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/android/c/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Lcom/kik/android/c/e;

.field private b:J

.field private c:J

.field private d:J


# direct methods
.method private constructor <init>(Lcom/kik/android/c/e;JJJ)V
    .locals 0

    .prologue
    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 166
    iput-wide p2, p0, Lcom/kik/android/c/f$b;->d:J

    .line 167
    iput-object p1, p0, Lcom/kik/android/c/f$b;->a:Lcom/kik/android/c/e;

    .line 168
    iput-wide p4, p0, Lcom/kik/android/c/f$b;->b:J

    .line 169
    iput-wide p6, p0, Lcom/kik/android/c/f$b;->c:J

    .line 170
    return-void
.end method

.method synthetic constructor <init>(Lcom/kik/android/c/e;JJJB)V
    .locals 0

    .prologue
    .line 157
    invoke-direct/range {p0 .. p7}, Lcom/kik/android/c/f$b;-><init>(Lcom/kik/android/c/e;JJJ)V

    return-void
.end method

.method static synthetic a(Lcom/kik/android/c/f$b;J)V
    .locals 1

    .prologue
    .line 157
    iput-wide p1, p0, Lcom/kik/android/c/f$b;->c:J

    return-void
.end method

.method static synthetic a(Lcom/kik/android/c/f$b;Lcom/kik/android/c/e;)V
    .locals 0

    .prologue
    .line 157
    iput-object p1, p0, Lcom/kik/android/c/f$b;->a:Lcom/kik/android/c/e;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .prologue
    .line 189
    iget-wide v0, p0, Lcom/kik/android/c/f$b;->c:J

    return-wide v0
.end method

.method public final a(J)Z
    .locals 3

    .prologue
    .line 214
    iget-wide v0, p0, Lcom/kik/android/c/f$b;->c:J

    cmp-long v0, v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Lcom/kik/android/c/e;
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lcom/kik/android/c/f$b;->a:Lcom/kik/android/c/e;

    return-object v0
.end method

.method public final c()Z
    .locals 4

    .prologue
    .line 199
    iget-wide v0, p0, Lcom/kik/android/c/f$b;->c:J

    iget-wide v2, p0, Lcom/kik/android/c/f$b;->d:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Z
    .locals 4

    .prologue
    .line 219
    iget-wide v0, p0, Lcom/kik/android/c/f$b;->c:J

    iget-wide v2, p0, Lcom/kik/android/c/f$b;->b:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
