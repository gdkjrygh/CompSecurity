.class final Lcom/crashlytics/android/au;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/crashlytics/android/i;

.field private final b:Lcom/crashlytics/android/ax;

.field private final c:Lcom/crashlytics/android/am;

.field private final d:J


# direct methods
.method public constructor <init>(JLcom/crashlytics/android/i;Lcom/crashlytics/android/ax;Lcom/crashlytics/android/am;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-wide p1, p0, Lcom/crashlytics/android/au;->d:J

    .line 17
    iput-object p3, p0, Lcom/crashlytics/android/au;->a:Lcom/crashlytics/android/i;

    .line 18
    iput-object p4, p0, Lcom/crashlytics/android/au;->b:Lcom/crashlytics/android/ax;

    .line 19
    iput-object p5, p0, Lcom/crashlytics/android/au;->c:Lcom/crashlytics/android/am;

    .line 20
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .prologue
    .line 23
    iget-wide v0, p0, Lcom/crashlytics/android/au;->d:J

    return-wide v0
.end method

.method public final b()Lcom/crashlytics/android/i;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/crashlytics/android/au;->a:Lcom/crashlytics/android/i;

    return-object v0
.end method

.method public final c()Lcom/crashlytics/android/ax;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/crashlytics/android/au;->b:Lcom/crashlytics/android/ax;

    return-object v0
.end method

.method public final d()Lcom/crashlytics/android/am;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/crashlytics/android/au;->c:Lcom/crashlytics/android/am;

    return-object v0
.end method
