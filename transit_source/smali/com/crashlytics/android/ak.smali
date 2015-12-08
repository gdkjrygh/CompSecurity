.class final Lcom/crashlytics/android/ak;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:[B

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;[BII)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/crashlytics/android/ak;->a:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lcom/crashlytics/android/ak;->b:[B

    .line 17
    iput p3, p0, Lcom/crashlytics/android/ak;->c:I

    .line 18
    iput p4, p0, Lcom/crashlytics/android/ak;->d:I

    .line 19
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/crashlytics/android/ak;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()[B
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/crashlytics/android/ak;->b:[B

    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/crashlytics/android/ak;->c:I

    return v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lcom/crashlytics/android/ak;->d:I

    return v0
.end method
