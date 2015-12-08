.class final Lkik/android/util/ck$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/util/ck;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/util/ck$a$a;
    }
.end annotation


# instance fields
.field final a:Ljava/util/ArrayList;

.field final b:Ljava/util/HashSet;

.field final c:Ljava/util/Map;

.field d:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/util/ck$a;->a:Ljava/util/ArrayList;

    .line 95
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lkik/android/util/ck$a;->b:Ljava/util/HashSet;

    .line 96
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lkik/android/util/ck$a;->c:Ljava/util/Map;

    .line 97
    sget v0, Lkik/android/util/ck$a$a;->a:I

    iput v0, p0, Lkik/android/util/ck$a;->d:I

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0}, Lkik/android/util/ck$a;-><init>()V

    return-void
.end method
