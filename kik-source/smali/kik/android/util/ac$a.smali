.class public final Lkik/android/util/ac$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/util/ac;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Landroid/view/View;

.field private final c:Z

.field private final d:Ljava/lang/String;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lkik/android/util/ac$a;->b:Landroid/view/View;

    .line 54
    iput-boolean p3, p0, Lkik/android/util/ac$a;->c:Z

    .line 55
    iput-object p4, p0, Lkik/android/util/ac$a;->d:Ljava/lang/String;

    .line 56
    iput-object p2, p0, Lkik/android/util/ac$a;->a:Landroid/view/View;

    .line 57
    return-void
.end method

.method synthetic constructor <init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;B)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1, p2, p3, p4}, Lkik/android/util/ac$a;-><init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 61
    iget-boolean v0, p0, Lkik/android/util/ac$a;->c:Z

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lkik/android/util/ac$a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Landroid/view/View;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lkik/android/util/ac$a;->a:Landroid/view/View;

    return-object v0
.end method
