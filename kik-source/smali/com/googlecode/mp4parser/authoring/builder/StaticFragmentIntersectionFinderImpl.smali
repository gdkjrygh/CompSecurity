.class public Lcom/googlecode/mp4parser/authoring/builder/StaticFragmentIntersectionFinderImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/builder/FragmentIntersectionFinder;


# instance fields
.field sampleNumbers:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/builder/StaticFragmentIntersectionFinderImpl;->sampleNumbers:Ljava/util/Map;

    .line 17
    return-void
.end method


# virtual methods
.method public sampleNumbers(Lcom/googlecode/mp4parser/authoring/Track;)[J
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/builder/StaticFragmentIntersectionFinderImpl;->sampleNumbers:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method
