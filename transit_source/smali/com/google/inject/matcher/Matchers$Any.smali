.class Lcom/google/inject/matcher/Matchers$Any;
.super Lcom/google/inject/matcher/AbstractMatcher;
.source "Matchers.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/matcher/Matchers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Any"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/matcher/AbstractMatcher",
        "<",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/google/inject/matcher/AbstractMatcher;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/inject/matcher/Matchers$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/inject/matcher/Matchers$1;

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/google/inject/matcher/Matchers$Any;-><init>()V

    return-void
.end method


# virtual methods
.method public matches(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 47
    const/4 v0, 0x1

    return v0
.end method

.method public readResolve()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 55
    invoke-static {}, Lcom/google/inject/matcher/Matchers;->any()Lcom/google/inject/matcher/Matcher;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    const-string v0, "any()"

    return-object v0
.end method
