.class final Lcom/kik/android/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/android/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field a:Ljava/util/Set;

.field b:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 728
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 729
    iput p1, p0, Lcom/kik/android/a$b;->b:I

    .line 730
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/kik/android/a$b;->a:Ljava/util/Set;

    .line 731
    return-void
.end method
