.class final Lkik/android/util/cm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/r$b;


# instance fields
.field final synthetic a:Lkik/android/util/ck$b;

.field final synthetic b:Lkik/android/util/ck;


# direct methods
.method constructor <init>(Lkik/android/util/ck;Lkik/android/util/ck$b;)V
    .locals 0

    .prologue
    .line 218
    iput-object p1, p0, Lkik/android/util/cm;->b:Lkik/android/util/ck;

    iput-object p2, p0, Lkik/android/util/cm;->a:Lkik/android/util/ck$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 218
    check-cast p1, Lorg/json/JSONArray;

    iget-object v0, p0, Lkik/android/util/cm;->b:Lkik/android/util/ck;

    iget-object v1, p0, Lkik/android/util/cm;->a:Lkik/android/util/ck$b;

    invoke-static {v0, p1, v1}, Lkik/android/util/ck;->a(Lkik/android/util/ck;Lorg/json/JSONArray;Lkik/android/util/ck$b;)V

    return-void
.end method
