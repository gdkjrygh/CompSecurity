.class public Lcom/facebook/orca/contacts/divebar/d;
.super Ljava/lang/Object;
.source "DivebarBadgingExperiment.java"


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/contacts/divebar/c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:J


# direct methods
.method private constructor <init>(Ljava/util/Set;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/contacts/divebar/c;",
            ">;J)V"
        }
    .end annotation

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/d;->a:Ljava/util/Set;

    .line 41
    iput-wide p2, p0, Lcom/facebook/orca/contacts/divebar/d;->b:J

    .line 42
    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Set;JLcom/facebook/orca/contacts/divebar/b;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/contacts/divebar/d;-><init>(Ljava/util/Set;J)V

    return-void
.end method
